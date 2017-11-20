def isLetter(c):
	return (c >= 'A' and c <= 'Z' or c >= 'a' and c <= 'z')

def isDigit(c):
	return (c >= '0' and c <= '9')	
	
def isDigitOrLetter(c):
	return (isDigit(c) or isLetter(c))

def canBeFirstSymbol(c):
	return (c == '_' or isLetter(c))

def isIdent(s):
	if (not canBeFirstSymbol(s[0])):
		return False
	i = 1
	while (i < len(s)):
		if (s[i] != '_' and not isDigitOrLetter(s[i])):
			return False
		i += 1
	return True

s = "abc;"

print(isIdent(s))
