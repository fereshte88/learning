//package
/*
It should be a lowercase letter such as java, lang.
If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.
 */
package com.rad.ajavaobjectclass.bnamingconvention;
/*
It should start with the uppercase letter.
It should be a noun such as Color, Button, System, Thread, etc.
Use appropriate words, instead of acronyms
 */
public class Employee {

    //method
    /*
    It should start with lowercase letter.
    It should be a verb such as main(), print(), println().
    If the name contains multiple words, start it with a lowercase letter followed by an uppercase letter such as actionPerformed().
     */
    void draw()
    {
        //code snippet
    }

    //variable
    /*
    It should start with a lowercase letter such as id, name.
    It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore).
    If the name contains multiple words, start it with the lowercase letter followed by an uppercase letter such as firstName, lastName.
    Avoid using one-character variables such as x, y, z.
     */
    int id;

    //constant
    /*
    It should be in uppercase letters such as RED, YELLOW.
    If the name contains multiple words, it should be separated by an underscore(_) such as MAX_PRIORITY.
    It may contain digits but not as the first letter.
     */
    static final int MIN_AGE = 18;
}

/*
CamelCase in java naming conventions

Java follows camel-case syntax for naming the class, interface, method, and variable.

If the name is combined with two words, the second word will start with uppercase letter always such as actionPerformed(), firstName, ActionEvent, ActionListener, etc.
 */
