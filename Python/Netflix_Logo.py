from turtle import *


pos = [(-40, 0), (40, 0)]
right(90)

bgcolor('black')
for x, y in pos:
    up()
    goto(x, y)
    down()


    fillcolor('red')
    begin_fill()
    for i in range(2):
        forward(200)
        left(90)
        forward(40)
        left(90)
    end_fill()

up()
goto(-40, 0)
down()
left(22)
begin_fill()
for i in range(2):
    forward(220)
    left(68)
    forward(40)
    left(112)
end_fill()
input()
