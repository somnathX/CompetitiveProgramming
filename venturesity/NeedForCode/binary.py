try:
	x=raw_input("Please enter number: ")
	n=int(x)
	x=str(n)
	if not '1' in x or not '0' in x:
		raise ValueError("noBin")
	print "Output:",int(x,2)
except ValueError:
	print "Input Error. Your input must contain only digits 0,1"
	
