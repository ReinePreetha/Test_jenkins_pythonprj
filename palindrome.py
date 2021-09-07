#To check if given number is palindrome or not
#
num = str(2112)# input number
print(num)
num_rev=num[: : -1]
if(num==num_rev):
    print("The given number is a palindrome")
else:
    print("The given number is not a palindrome")