#from django.shortcuts import render

from .models import *
from django.http import HttpResponse, HttpResponseRedirect, Http404
from django.shortcuts import render, get_object_or_404
from django.urls import reverse
from django.db.models import F

def index(request):
    latest_question_list = Question.objects.order_by("-pub_date")[:5]
    context = {"questions": latest_question_list}
    return render(request, "polls/index.html", context)

def detail(request, question_id):
    """try :
        question = Question.objects.get(pk=question_id)
    except Question.DoesNotExist:
        raise Http404("Question does not exist")"""
    
    question = get_object_or_404(Question, pk=question_id)
    return render(request, "polls/detail.html", {"question" : question})

def some_url(request) :
    return HttpResponse("Some Url을 구현")

def vote(request, question_id):
    question = get_object_or_404(Question, pk=question_id)
    try:
        selected_choice = question.choice_set.get(pk=request.POST['choice'])
    except (KeyError, Choice.DoesNotExist):
        return render(request, 'polls/detail.html', {'question': question, 'error_message': f"선택이 없습니다. id={request.POST['choice']}"})

    else:
        # A서버에서도 Votes = 0
        # B서버에서도 Votes = 0
        
        #selected_choice.votes += 1
        #투표 수 +1
        selected_choice.votes = F('votes') + 1

        selected_choice.save()
        #투표 수 저장
        
        return HttpResponseRedirect(reverse('polls:result', args = (question_id,)))
    
def result(request, question_id) :
    question = get_object_or_404(Question, pk=question_id)
    return render(request, 'polls/result.html', {'question' : question})