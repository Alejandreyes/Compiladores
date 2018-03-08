def fizzbuzz(limite):
    i = 1
    while i <= limite:
        valor = True
        if (i%3 == 0 and i%5 == 0):
            print('fizzbuzz')
            valor = False
        if i % 3 == 0 :
            print('fizz')
            valor = False
        if i%5 == 0:
            print('buzz')
            valor = False
        if(valor):
            print(i)
        i+=1
