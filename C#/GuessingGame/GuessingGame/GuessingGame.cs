using System;

namespace GuessingGame
{
    class GuessingGame
    {
        private static Random random = new Random();
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
                    PlayGame();
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
            catch(FormatException ex)
            {
                Console.WriteLine(ex.Message);
            }
            catch(InvalidCastException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void PlayGame()
        {
            int Guess;
            int Count = 1;
            int Value = random.Next(1, 101);
            int Exit = 999;
            Console.WriteLine("Guess the Random Number between 1 and 100");
            Console.WriteLine("Input your guess , or 999 to exit the game");
            Guess = int.Parse(Console.ReadLine());
            while (!(Guess == Value) && !(Guess == Exit))
            {
                try
                {
                    if ((Guess > Value) && (Guess <= 100))
                    {
                        Console.WriteLine("Your guess is too high");
                        Count++;
                        Console.WriteLine("Enter another guess!");
                        Console.WriteLine("Input 999 to exit the game");
                        Guess = int.Parse(Console.ReadLine());
                    }
                    else if ((Guess < Value) && (Guess >= 1))
                    {
                        Console.WriteLine("Your guess is too low");
                        Count++;
                        Console.WriteLine("Enter another guess!");
                        Console.WriteLine("Input 999 to exit the game");
                        Guess = int.Parse(Console.ReadLine());
                    }
                    else if (Guess > 100)
                    {
                        Console.WriteLine("Invalid guess range. Too High!");
                        Count++;
                        Console.WriteLine("Enter another guess!");
                        Console.WriteLine("Input 999 to exit the game");
                        Guess = int.Parse(Console.ReadLine());
                    }
                    else if (Guess < 1)
                    {
                        Console.WriteLine("Invalid guess range. Too Low!");
                        Count++;
                        Console.WriteLine("Enter another guess!");
                        Console.WriteLine("Input 999 to exit the game");
                        Guess = int.Parse(Console.ReadLine());
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
            if (Guess == Value)
            {
                Console.WriteLine("Congratulations you guessed it right! The number was " + Value);
                Console.WriteLine("It took you " + Count + " guessing attempts to get the right number");
            }
            else if (Guess == Exit)
            {
                Console.WriteLine("Thanks for playing!");
            }
        }
    }
}
