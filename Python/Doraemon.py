from turtle import *

setup(500, 500)

# Set brush
speed(10)
bgcolor("black")
shape("turtle")
colormode(255)

def drawRound(size, filled):
    pendown()
    if filled == True:
        begin_fill()
    setheading(180)
    circle(size, 360)
    if filled == True:
        end_fill()


def drawRect(length, width, filled):
    setheading(0)
    pendown()
    if filled == True:
        begin_fill()
    forward(length)
    right(90)
    forward(width)
    right(90)
    forward(length)
    right(90)
    forward(width)
    if filled == True:
        end_fill()