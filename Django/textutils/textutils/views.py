# We have created this file
from django.http import HttpResponse
from django.shortcuts import render


def index(request):
    # return HttpResponse("Home")
    return render(request, 'index.html')



def analyze(request):
    # GETTING THE TEXT
    djtext = request.POST.get('text', 'default')

    # CHECKBOX VALUES
    removepunc = request.POST.get('removepunc', 'off')
    fullcaps = request.POST.get('fullcaps', 'off')
    newlineremover = request.POST.get('newlineremover', 'off')
    extraspaceremover = request.POST.get('extraspaceremover', 'off')

    params = {'purpose': '', 'analyzed_text': '', 'charcount': 0}

    # CHECKING WHICH CHECKBOX IS ON
    if removepunc == "on":
        punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
        analyzed = ""
        for char in djtext:
            if char not in punctuations:
                analyzed = analyzed + char

        djtext = analyzed

        if params['purpose'] == '':
            params['purpose'] = 'Punctuations Removed'
        else:
            params['purpose'] = params['purpose'] + ', Punctuations Removed'


    if fullcaps == "on":
        analyzed = ""
        for char in djtext:
            analyzed = analyzed + char.upper()
        djtext = analyzed

        if params['purpose'] == '':
            params['purpose'] = 'Change To Uppercase'
        else:
            params['purpose'] = params['purpose'] + ', Change To Uppercase'

    if newlineremover == "on":
        analyzed = ""
        for char in djtext:
            if char != '\n' and char != '\r':
                analyzed = analyzed + char

        djtext = analyzed

        if params['purpose'] == '':
            params['purpose'] = 'Removed New Lines'
        else:
            params['purpose'] = params['purpose'] + ', Removed New Lines'

    if extraspaceremover == "on":
        analyzed = ""
        for index,char in enumerate(djtext):
            if not(djtext[index] == ' ' and djtext[index+1] == ' '):
                analyzed = analyzed + char

        djtext = analyzed

        if params['purpose'] == '':
            params['purpose'] = 'Removed Extra Spaces'
        else:
            params['purpose'] = params['purpose'] + ', Removed Extra Spaces'



    if removepunc == "off" and extraspaceremover == "off" and newlineremover == "off" and fullcaps == "off":
        return HttpResponse("<h1>Error</h1>")
    else:

        params['analyzed_text'] = djtext
        params['charcount'] = len(djtext)
        return render(request, "analyze.html", params)
