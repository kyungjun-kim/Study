from django.db import models
from django.utils import timezone
from django.contrib import admin
import datetime

# Create your models here.
# 모델 생성
# 모델을 테이블에 써 주기 위한 마이그레이션이라는걸 만든다
# 이 모델에 맞는 테이블 생성

# 질문 : 여름에 놀러간다면 어디에 갈래?

class Question(models.Model) :
    question_text = models.CharField(max_length=200, verbose_name="질문")
    pub_date = models.DateTimeField(auto_now_add=True, verbose_name='생성일')

    @admin.display(boolean=True, description='최근생성(하루기준)')
    def was_published_recently(self):
        return self.pub_date >= timezone.now() - datetime.timedelta(days=1)
    
    def __str__(self):
        return f'제목 : {self.question_text}, 날짜 : {self.pub_date}'

class Choice(models.Model) :
    question = models.ForeignKey(Question, on_delete=models.CASCADE)

    choice_text = models.CharField(max_length=200)

    votes = models.IntegerField(default=0)

    def __str__(self):
        return f"[{self.question.question_text}] {self.choice_text}"