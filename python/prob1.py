'''
If we list all the natural numbers below $10$ that are multiples of $3$ or $5$, we get $3, 5, 6$ and $9$. The sum of these multiples is $23$.
Find the sum of all the multiples of $3$ or $5$ below $1000$.
'''

def multiples_of_3_or_5(n: int) -> int:
    multiple_sum = 0
    for i in range(n):
        if(i % 3 == 0) or (i % 5 == 0):
            multiple_sum += i
    return multiple_sum

if __name__ == '__main__':
    print(multiples_of_3_or_5(1000))
