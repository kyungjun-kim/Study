from django.contrib import admin
from .models import *

class ChoiceInline(admin.TabularInline):
    #TabularInline을 상속받으면 오브젝트들을 가로로 나열하여 표시할 수 있습니다
    #StackedInline을 상속받으면 오브젝트들을 세로로 나열하여 표시할 수 있습니다
    model = Choice
    extra = 3

class QuestionAdmin(admin.ModelAdmin):
    fieldsets = [
        ('질문 섹션', {'fields': ['question_text']}),
        ('생성일', {'fields': ['pub_date'], 'classes': ['collapse']}),        
    ] 

    list_display = ('question_text', 'pub_date', 'was_published_recently')
    readonly_fields = ['pub_date']
    inlines = [ChoiceInline]
    list_filter = ['pub_date']
    search_fields = ['question_text', 'choice__choice_text']

admin.site.register(Question, QuestionAdmin)