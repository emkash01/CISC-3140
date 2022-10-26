#!/bin/bash

echo" Enter the month its due"
read month
echo "etner the day its due"
read day
echo "enter the year its due"
read year

combiner = $(date -j -f '%m%d%Y'); #this turns it into the jave equic of a obj

date = date + "%m-%d-%Y"

diff = $(($combiner - $date))

days = $(($diff / (60*60*24)))
echo $days

#the user inputs his own custom date and the combiner turns them into one
#collective date. That date var gets the current date and the days var gets
#the difference between the 2 entered dates & converts it into a day format.
#The program wasn't the exact same but the general idea of it is the same
#I find that it wasnt too difficult overall, its just a matter of learning 
#syntax & what goes where. I found there were very little lines of code needed
#for this but I definitely prefer Java more because this like % still confuses me
# but also because I am much more experienced in that at the moment
#I did not import anything, although my code does not work properly, so that
# might be a reason why.
