# This is our first code in Python

# PEP 

n = int(input())
if (n >= 10000):
	print("We offer you ADS")
else:
	# print("You have " + str(n) + " likes.")
	print("You have %s likes." % n)

	
s = raw_input() # this is Python 2, in Python 3 - input()
n = len(s)
counter = 0
i = 0
while (i < n):
	c = s[i]
	if c == 'a' or c == 'A': # c.lower()
		counter += 1
	i += 1
print(counter)
print("End.")