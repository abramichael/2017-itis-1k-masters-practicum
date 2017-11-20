import re

s = "2abc"

m = re.search("[A-Za-z_][A-Za-z0-9_]*", "abc")
print m.group(0)

