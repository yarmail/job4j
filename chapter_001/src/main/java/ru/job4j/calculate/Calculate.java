package ru.job4j.calculate;

/**
* Console output Hello World.
* Вывод в консоль Hello World
*
* @autor Yarmail (yarmail@yandex.ru)
* @version $Id$
* @since 0.1
*/

public class Calculate {

	/**
	* Main
	* @param args - args
	*/
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	/**
	* Method echo.
	* @param name Your name.
	* @return Echo plus your name.
	*/
	public String echo(String name) {
        return "Echo, echo, echo : " + name;
   	}
}