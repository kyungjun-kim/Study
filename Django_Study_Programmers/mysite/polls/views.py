#from django.shortcuts import render

from django.http import HttpResponse
# Create your views here.

def index(requests):
    return HttpResponse("Hello, World!")

def some_url(requests):
    return HttpResponse("Some_URL 구현")