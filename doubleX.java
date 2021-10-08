/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/
boolean doubleX(String str) {
  boolean value = false;
  for (int i = 0; i < str.length()-1; i++) {
    if (str.charAt(i) == 'x') {
      if (str.charAt(i+1) == 'x') {
        value = true;
        break;
      } else {
        value = false;
        break;
      }
    }
  }
    // if (str.substring(i, i+2).equals("xx")) {
    //   value = true;
    //   break;
    // }
  return value;
}
