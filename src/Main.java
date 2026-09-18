//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
int intOperandA = 1;
int intOperandB = 5;
int intSum = 13;
int intProduct = 24;
int intDifference = 7;
int intQuotient = 3;
int intModulo = 0;

double doubleOperandA = 3.50;
double doubleOperandB = 2.25;
double doubleSum = 5.75;
double doubleProduct = 7.25;
double doubleDifference = 1.25;
double doubleQuotient = 4.50;

intSum = intOperandA + intOperandB; // Assignment that uses the arithmetic operator +
System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum); // Output statement;
intDifference = intOperandA - intOperandB; // Assignment that uses the arithmetic operator -
System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference); // Output statement;
intProduct = intOperandA * intOperandB; // Assignment that uses the arithmetic operator *
System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is "+ intProduct); // Output statement;
intQuotient = intOperandA / intOperandB; // Assignment that uses the arithmetic operator /
System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient); // Output statement;
intModulo = intOperandA % intOperandB; // Assignment that uses the arithmetic operator %
System.out.println ("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo); // Output statement;

doubleSum = doubleOperandA + doubleOperandB; // Assignment that uses the arithmetic operator +
System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum); // Output statement;
doubleDifference = doubleOperandA - doubleOperandB; // Assignment that uses the arithmetic operator -
System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference); // Output statement;
doubleProduct = doubleOperandA * doubleOperandB; // Assignment that uses the arithmetic operator *
System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct); // Output statement;
doubleQuotient = doubleOperandA / doubleOperandB; // Assignment that uses the arithmetic operator /
System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient); // Output statement;


// TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}
