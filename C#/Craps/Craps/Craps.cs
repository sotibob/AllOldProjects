using System;

namespace Craps
{
    class Craps
    {
        public static void Main(string[] args)
        {
            try
            {
                String Input;
                String Yes = "Y";
                String No = "N";
                Console.WriteLine("Start game?!");
                Console.WriteLine("Input Y to Start, or N to Exit");
                Input = Console.ReadLine();
                while (!(Input == Yes) && !(Input == No))
                {
                    Console.WriteLine("Please Input a Valid Response");
                    Console.WriteLine("Input Y to Start, or N to Exit");
                    Input = Console.ReadLine();
                }
                while (Input == Yes)
                {
                    PlayCraps();
                    Console.WriteLine("Do you want to play again?");
                    Console.WriteLine("If Yes input Y");
                    Console.WriteLine("If No input N");
                    Input = Console.ReadLine();
                    while (!(Input == Yes) && !(Input == No))
                    {
                        Console.WriteLine("Please Input a Valid Response");
                        Console.WriteLine("Input Y to Start, or N to Exit");
                        Input = Console.ReadLine();
                    }
                }
                if (Input == No)
                {
                    Console.WriteLine("Thanks for playing!");
                }
            }
            catch (FormatException ex)
            {
                Console.WriteLine(ex.Message);
            }
            catch (InvalidCastException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
        public static void PlayCraps()
        {
            String Exit = "999";
            String Roll = "R";
            Console.WriteLine("Roll a 7, or an 11 to win");
            Console.WriteLine("Roll a 2, 3, or a 12 and you lose");
            Console.WriteLine("Input R to Roll and 999 to exit");
            String Input = Console.ReadLine();
            while ((Input != Roll) && (Input != Exit))
            {
                Console.WriteLine("Please Input a Valid Response");
                Console.WriteLine("Input R to Roll and 999 to exit");
                Input = Console.ReadLine();
            }
            if (Input == Roll)
            {
                Die Value1 = new Die();
                Die Value2 = new Die();
                int Total = Value1.Random + Value2.Random;
                Console.WriteLine("Your numbers were " + Value1.Random + ", and " + Value2.Random + " with a Total of " + Total);
                if ((Total == 7) || (Total == 11))
                {
                    Console.WriteLine("Congratulations! You Won; You rolled " + Total);
                }
                else if ((Total == 2) || (Total == 3) || (Total == 12))
                {
                    Console.WriteLine("Try Your Luck Next Time! You Lost; You rolled " + Total);
                }
                else if (!(Total == 2) || !(Total == 3) || !(Total == 12) || !(Total == 7) || !(Total == 11))
                {
                    int newTotal = 0;
                    String newExit = "999";
                    String newRoll = "R";
                    Console.WriteLine("You rolled " + Total + ", and that is your new base point as you didn't win or lose");
                    Console.WriteLine("Roll exactly " + Total + " to win");
                    Console.WriteLine("Roll a 7 and you lose");
                    Console.WriteLine("Input R to roll, and 999 to Exit");
                    String newInput = Console.ReadLine();
                    while ((newInput != Roll) && (newInput != Exit))
                    {
                        Console.WriteLine("Please Input a Valid Response");
                        Console.WriteLine("Input R to Roll and 999 to exit");
                        newInput = Console.ReadLine();
                    }
                    while (newInput == newRoll)
                    {
                        newTotal = 0;
                        Die Value3 = new Die();
                        Die Value4 = new Die();
                        newTotal = Value3.Random + Value4.Random;
                        Console.WriteLine("Your numbers were " + Value3.Random + ", and " + Value4.Random + " with a Total of " + newTotal + ", and a base point of " + Total);
                        if ((newTotal != 7) && (newTotal != Total))
                        {
                            Console.WriteLine("Input R to Roll again, and 999 to exit");
                            newInput = Console.ReadLine();
                            while ((newInput != Roll) && (newInput != Exit))
                            {
                                Console.WriteLine("Please Input a Valid Response");
                                Console.WriteLine("Input R to Roll and 999 to exit");
                                newInput = Console.ReadLine();
                            }
                        }
                        else if (newTotal == 7)
                        {
                            Console.WriteLine("Try Your Luck Next Time! You Lost; You rolled a 7");
                            newInput = newExit;
                        }
                        else if (newTotal == 9)
                        {
                            Console.WriteLine("Congratulations! You won; You rolled a 9");
                            newInput = newExit;
                        }
                    }
                    if (newInput == newExit)
                    {
                        Console.WriteLine("Thanks for playing!");
                    }
                }
            }
            else if (Input == Exit)
            {
                Console.WriteLine("Thanks for playing!");
            }
        }
    }
}
