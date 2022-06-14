"""Codingbat Warmup-1 solutions

Practise solving programming challenges at codingbat.com
"""

# sleep_in
def sleep_in(weekday, vacation):
  if(not weekday and not vacation):
    return True
  elif(weekday and not vacation):
    return False
  elif(not weekday and vacation):
    return True
  else:
    return True

# monkey trouble
def monkey_trouble(a_smile, b_smile):
  return (a_smile == b_smile)

# sum_double
def sum_double(a, b):
  if a == b:
    return sum((a,b)) * 2
  return sum((a,b))

# dif21
def diff21(n):
  diff = abs(21 - n)
  if(n > 21):
    return diff * 2
  return diff

# parrot_trouble
def parrot_trouble(talking, hour):
  return (talking and (hour < 7 or hour > 20))

# makes10
def makes10(a, b):
  return (a==10 or b==10 or a + b == 10)

# near_hundred
def near_hundred(n):
  return ((abs(100 - n) <= 10) or (abs(200 - n) <= 10))

# pos_neg
def pos_neg(a, b, negative):
  if negative:
    return (a < 0 and b < 0)
  return ((a < 0 and b > 0) or (a > 0 and b < 0))

# not_string
def not_string(str):
  if(str.startswith('not')):
    return str
  return ('not ' + str)

# missing_char
def missing_char(str, n):
    new_string = ''
    new_string += str.replace(str[n], '')
    return new_string

# front_back
def front_back(str):
  if len(str) <= 1:
    return str
  return str[len(str)-1] + str[1:len(str)-1] + str[0]

# front3
def front3(str):
  if len(str) <= 3:
    return str * 3
  return str[ : 3] * 3