from rest_framework import serializers
from polls.models import Question

class QuestionSerializer(serializers.ModelSerializer) :
    class Meta :
        model = Question
        fields = ['id', 'question_text', 'pub_date']


"""class QuestionSerializer(serializers.Serializer) :
    id = serializers.IntegerField(read_only = True)
    question_text = serializers.CharField(max_length = 200)
    pub_date = serializers.DateTimeField(read_only = True)

    def create(self, validated_data) :
        return Question.objects.create(**validated_data)
    
    def update(self, instance, validated_data) :
        instance.question_text = validated_data.get('question_text', instance.question_text) + "[시리얼라이저에서 업데이트]"
        instance.save()
        return instance"""
