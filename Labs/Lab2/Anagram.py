def isAnagram(s,t):
  if len(s) != len(t):
    return False
  arrayS = s.split().sort()
  arrayT = t.split().sort()

  return arrayS == arrayT

print(isAnagram("silent","listen"))
    
