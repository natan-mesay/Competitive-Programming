def countSwaps(a):
    # Write your code here
    count = 0
    for i in range(len(a)):
        for j in range(i + 1, len(a)):
            if a[i] > a[j]:
                a[i], a[j] = a[j], a[i]
                count += 1
    print('Array is sorted in '+ str(count)+ ' swaps.')  
    print('First Element:',a[0]) 
    print('Last Element:',a[-1])