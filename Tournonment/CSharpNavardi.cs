using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace main
{
	public class Program {
		public static void Main(string[] args) {
			int a = Convert.ToInt32(Console.ReadLine());
			int b = Convert.ToInt32(Console.ReadLine());
			
			if (a == b) {
			  Console.WriteLine("0");
			} else if (a == 1 && (b == 2 || b == 3)) {
			  Console.WriteLine("1");
			} else if (a == 2 && (b == 1 || b == 4)) {
			  Console.WriteLine("1");
			} else if (a == 3 && (b == 1 || b == 4)) {
			  Console.WriteLine("1");
			} else if (a == 4 && (b == 2 || b == 3)) {
			  Console.WriteLine("1");
			} else {
			  Console.WriteLine("2");
			}
		}
	}
}
