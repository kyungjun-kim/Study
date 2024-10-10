from django.db import models

# Create your models here.
# 모델 생성
# 모델을 테이블에 써 주기 위한 마이그레이션이라는걸 만든다
# 이 모델에 맞는 테이블 생성

# 질문 : 여름에 놀러간다면 어디에 갈래?

class Question(models.Model) :
    question_text = models.CharField(max_length=200)
    pub_date = models.DateTimeField("Date published")

class Choice(models.Model) :
    question = models.ForeignKey(Question, on_delete=models.CASCADE)
    choice_text = models.CharField(max_length=200)
    votes = models.IntegerField(default=0)