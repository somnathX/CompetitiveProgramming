'''
	Program: To convert binary to decimal
	Programmer: Som Nath(rs.somnath3@gmail.com)
'''
try:
	x=raw_input("Please enter number: ")
	res=int(x,2) #if number contains any invalid input, it will raise error.
	print "Output:",res
except ValueError:
	print "Input Error. Your input must contain only digits 0,1"
