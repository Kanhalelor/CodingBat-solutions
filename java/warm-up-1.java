
/*Warm up 1 Solutions */

// sleepIn

public boolean sleepIn(boolean weekday, boolean vacation) {
    if(!weekday &&  vacation) {
      return true;
    } else if(weekday && !vacation) {
      return false;
    } else if(!weekday && vacation) {
      return true;
    } else {
      return true;
    }
  }

// -------------------------------------------------------------------- //

// monkeyTrouble
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if(!aSmile && !bSmile) {
      return true;
    } else if(aSmile && bSmile) {
      return true;
    } else {
      return false;
    }
  }
 
 // -------------------------------------------------------------------- //

// sumDouble
public int sumDouble(int a, int b) {
    if(a == b) {
      return (a + b) * 2;
    } else {
      return a + b;
    }
  }
 
 // -------------------------------------------------------------------- //

// diff21
public int diff21(int n) {
    if (n <= 21) {
      return 21 - n;
    } else {
      return (n - 21) * 2;
    }
  }

 // -------------------------------------------------------------------- //

// parrotTrouble
public boolean parrotTrouble(boolean talking, int hour) {
    if(talking && hour < 7) {
      return true;
    }
    if(talking && hour > 20) {
      return true;
    }
    else {
      return false;
    }
  }

// -------------------------------------------------------------------- //

// makes10
public boolean makes10(int a, int b) {
    return (a == 10 || b == 10 || a + b == 10);
  }
  
// -------------------------------------------------------------------- //

// near100
public boolean nearHundred(int n) {
    return (90 <= n && n <= 110 || 190 <= n && n <= 210);
  }
  
// -------------------------------------------------------------------- //

 //posNeg
 public boolean posNeg(int a, int b, boolean negative) {
    if (negative) {
      return (a < 0 && b < 0);
    }
    else {
      return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }
  } 
