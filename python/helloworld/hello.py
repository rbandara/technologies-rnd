__author__ = 'txrzb'


def fib(n):
    print "Printing fibonacci of "
    a, b, c = 0, 1, 1

    while c < n:
        a, b = b, a + b
        c = c + 1
        print b


# fib(10)

def cube(x): return x*x*x

# print map ( cube, range(1,10))
print map ( lambda x: x*x*x , range(1,10))

print(range(8))


list = [-8, 4, 3 , 5, 9]


for i, v in enumerate(list):
    print i, v


questions = ['name', 'quest', 'favorite color', 'bar']
answers = ['lancelot', 'the holy grail', 'blue', 'foo']
for q, a in zip(questions, answers):
    print 'What is your {0}?  It is {1}.'.format(q, a)


f = open('sender.py','r')
for line in f:
    print line

class MyClass:

    i = 12345

    def f(self):
        return 'hello world!!!!'

m = MyClass()
print(m.f())
