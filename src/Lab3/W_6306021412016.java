package Lab3;

public class W_6306021412016 {
    public static void main(String[] args) {
        //ข้อ 3
       Integer X=0,A=10,B=7,C=3,D=6,E=1,F=2;
       System.out.println("3.1 X = A / F - C * B + E;");
       X = A / F - C * B + E; 
       System.out.println("AND 3.1 = "+ X);
      
       System.out.println("3.2 X = B + C * E - F % A;");
       X = B + C * E - F % A;
       System.out.println("AND 3.2 = "+ X);
      
       System.out.println("3.3 X = E * B * D - F % A;");
       X = E * B * D - F % A;
       System.out.println("AND 3.3 = "+ X);
       
       System.out.println("3.4 X = C % F + A + B / E;");
       X = C % F + A + B / E;
       System.out.println("AND 3.4 = "+ X);
       
       System.out.println("3.5 X = A - B * E / B % D;");
       X = A - B * E / B % D;
       System.out.println("AND 3.5 = "+ X);
       
       System.out.println("3.6 X = F * A - D + E * D;");
       X = F * A - D + E * D;
       System.out.println("AND 3.6 = "+ X);
       
       System.out.println("3.7 X = A * D - B + B * D;");
       X = A * D - B + B * D;
       System.out.println("AND 3.7 = "+ X);
       
       System.out.println("3.8 X = D / E % A + F - D;");
       X = D / E % A + F - D;
       System.out.println("AND 3.8 = "+ X);
       
       System.out.println("3.9 X = E % A - B * C - A;");
       X = E % A - B * C - A;
       System.out.println("AND 3.9 = "+ X);
       
       System.out.println("3.10 X = B + F - B % E * F;");
       X = B + F - B % E * F;
       System.out.println("AND 3.10 = "+ X);
       
       //ข้อ 4
       X=0;A=5;B=2;C=11;D=4;E=3;F=7;
       System.out.println("4.1 X = (A - D) * F % B;");
       X = (A - D) * F % B;
       System.out.println("AND 4.1 = "+ X);

       System.out.println("4.2 X += (A % D - E) + B * C;");
       X += (A % D - E) + B * C;
       System.out.println("AND 4.2 = "+ X);

       System.out.println("4.3 X = F / (D + E - B * A) % C;");
       X = F / (D + E - B * A) % C;
       System.out.println("AND 4.3 = "+ X);

       System.out.println("4.4 X += (D * A - B / C) - (A % C / D - E);");
       X += (D * A - B / C) - (A % C / D - E);
       System.out.println("AND 4.4 = "+ X);

       System.out.println("4.5 X -= (A - B) + C % (F - E + A);");
       X -= (A - B) + C % (F - E + A);
       System.out.println("AND 4.5 = "+ X);

       System.out.println("4.6 X = (B + D / C) - A * F;");
       X = (B + D / C) - A * F;
       System.out.println("AND 4.6 = "+ X);

       System.out.println("4.7 X *= (C - A % B) * ( D - F / E) + (A - C);");
       X *= (C - A % B) * ( D - F / E) + (A - C);
       System.out.println("AND 4.7 = "+ X);

       System.out.println("4.8 X -= E % D / F + (B - C + A);");
       X -= E % D / F + (B - C + A);
       System.out.println("AND 4.8 = "+ X);
       
       System.out.println("4.9 X = D / (C + (A - F * E)) + C;");
       X = D / (C + (A - F * E)) + C;
       System.out.println("AND 4.9 = "+ X);

       System.out.println("4.10 X += C - (A * F ) / E % ( D - C) * A + B;");
       X += C - (A * F ) / E % ( D - C) * A + B;
       System.out.println("AND 4.10 = "+ X);
        
       //ข้อ 5
       Boolean Flag = true;
       A=7; B=3; C=2; D=9;
       System.out.println("5.1 A < 5 || C > B;");
       Flag = A < 5 || C > B;
       System.out.println("AND 5.1 = "+ Flag);

       System.out.println("5.2 C == A && A < D;");
       Flag = C == A && A < D;
       System.out.println("AND 5.2 = "+ Flag);

       System.out.println("5.3 B <= 3 || D > A;");
       Flag = B <= 3 || D > A;
       System.out.println("AND 5.3 = "+ Flag);

       System.out.println("5.4 A >= C + 9 && C > D - B;");
       Flag = A >= C + 9 && C > D - B;
       System.out.println("AND 5.4 = "+ Flag);

       System.out.println("5.5 C != B || A < D;");
       Flag = C != B || A < D;
       System.out.println("AND 5.5 = "+ Flag);

       System.out.println("5.6 D < A - 7 || C < A % 9;");
       Flag = D < A - 7 || C < A % 9;
       System.out.println("AND 5.6 = "+ Flag);

       System.out.println("5.7 C > D && C > A + 3;");
       Flag = C > D && C > A + 3;
       System.out.println("AND 5.7 = "+ Flag);

       System.out.println("5.8 D <= C * B && D == A;");
       Flag = D <= C * B && D == A;
       System.out.println("AND 5.8 = "+ Flag);

       System.out.println("5.9 A < B || A < C;");
       Flag = A < B || A < C;
       System.out.println("AND 5.9 = "+ Flag);

       System.out.println("5.10 B != D / A && A % B == C;");
       Flag = B != D / A && A % B == C;
       System.out.println("AND 5.10 = "+ Flag);

       //ข้อ 6
       A=2; B=7; C=10; D=8; E=3;
       System.out.println("6.1 D!= 5 || A == B + 4 && E <= B;");
       Flag = D!= 5 || A == B + 4 && E <= B;
       System.out.println("AND 6.1 = "+ Flag);

       System.out.println("6.2 C > D && A < E  || B > 8;");
       Flag = C > D && A < E  || B > 8;
       System.out.println("AND 6.2 = "+ Flag);

       System.out.println("6.3 A + 9! = C + 7 || B + C >= E || E % A == 3;");
       Flag = A + 9 != C + 7 || B + C >= E || E % A == 3;
       System.out.println("AND 6.3 = "+ Flag);

       System.out.println("6.4 B - 13 < B * E && A == 2 && D <= 7;");
       Flag = B - 13 < B * E && A == 2 && D <= 7;
       System.out.println("AND 6.4 = "+ Flag);

       System.out.println("6.5 E % C != 5 || E / A < 13 && D < C - A + 3;");
       Flag = E % C != 5 || E / A < 13 && D < C - A + 3;
       System.out.println("AND 6.5 = "+ Flag);

       System.out.println("6.6 (C < A + 3 || B + 9 < A - 1) && A == C / A;");
       Flag = (C < A + 3 || B + 9 < A - 1) && A == C / A;
       System.out.println("AND 6.6 = "+ Flag);
       
       System.out.println("6.7 (B != 3 || A + E < D) || (A + 3 != B || A <= C);");
       Flag = (B != 3 || A + E < D) || (A + 3 != B || A <= C);
       System.out.println("AND 6.7 = "+ Flag);

       System.out.println("6.8 (A != D - B && B < A - C || C > D) && (D > B || B > A - 13);");
       Flag = (A != D - B && B < A - C || C > D) && (D > B || B > A - 13);
       System.out.println("AND 6.8 = "+ Flag);

       System.out.println("6.9 (C < B && !(A > C % D) || (A> B || B < E + 3)) && C> E-6;");
       Flag = (C < B && !(A > C % D) || (A> B || B < E + 3)) && C> E-6;
       System.out.println("AND 6.9 = "+ Flag);
       
       System.out.println("6.10 E >= 5 && (A > C % E && A < D)|| !(A <= 3);");
       Flag = E >= 5 && (A > C % E && A < D)|| !(A <= 3);
       System.out.println("AND 6.10 = "+ Flag);





    
    }
}
