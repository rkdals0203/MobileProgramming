package com.example.mobileprogramming

import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtView: TextView = findViewById(R.id.txtSay)
        txtView.text = "This string is changed"

        val txtBtn: Button = findViewById(R.id.btnSay)
        txtBtn.setOnClickListener{
            txtView.visibility = View.INVISIBLE
        }
        /* HW Assignment problem 1
       val expression = "100 * 10"
       val tokenizedExpression = StringTokenizer(expression) //I used StringTokenizer class to tokenize strings with white space
       val operand1 = tokenizedExpression.nextToken().toInt() //and I used toInt() method to make the string type into int type
       val operator = tokenizedExpression.nextToken()
       val operand2 = tokenizedExpression.nextToken().toInt()
       var result = 0
       when(operator){
           "+" -> result = operand1 + operand2 //I divided the case with the operator input and make calculation
           "-" -> result = operand1 - operand2
           "*" -> result = operand1 * operand2
           "/" -> result = operand1 / operand2
       }
       Log.d("HW01", "result: $result, (expression: $expression)")
       */
        /* HW Assignment problem 2
        val capacity = 10 // modify this for test
        var myUniqueArray = mutableSetOf<Int>() // Every elements should be unique, so I used mutableSetof<Int>

        while (myUniqueArray.size < capacity) {
            val randomNumber = (1..100).random() // Generating a random number between 1 and 100
            myUniqueArray.add(randomNumber)
        }
        Log.d("HW01", "result: $myUniqueArray, capacity: $capacity") */
        /* HW Assignment problem 3
        val strLine = "Seoul National University of Science and Technology"
        val tokenizedStrLine = StringTokenizer(strLine) // I used StringTokenizer to tokenize strings with white space
        var numOfWord = tokenizedStrLine.countTokens() // Tokens counted by this principle will be number of words
        Log.d("HW01", "The number of word is $numOfWord")
        */
        /* HW Assignment problem 4
        var str = "I Love Kotlin" // Modify this string for testing
        Log.d("HW01", str)

        val arrayStr = str.toCharArray() // Make the string into an array

        for(i in arrayStr.size-1 downTo 0) {
            for (j in arrayStr.size - 1 downTo 1) { // from 12 to 1
                val temp = arrayStr[j] // save the right-most one into temp
                arrayStr[j] = arrayStr[j - 1] // replace that character with left one
                arrayStr[j - 1] = temp // temp is going left
            }
            val result = String(arrayStr)
            Log.d("HW01", result)
        }
        */
        /* HW Assignment problem 5
        val str = "jininij" // modify this for test
        var isPalindrome = true //boolean
        if(str.length/2 ==0){ // the case length of string is even
            for(i in 0 until str.length/2) { // number of left letters
                if (str[i] != str[str.length-1-i]){ // matching with the corresponding opposite letter
                    isPalindrome = false
                    break;
                }
            }
        }else{ // the case length of string is odd
            for(i in 0 until str.length-1/2) {
                if (str[i] != str[str.length-1-i]){
                    isPalindrome = false
                    break;
                }
            }
        }
        if (isPalindrome){
            Log.d("HW01", "$str is palindrome!")
        }else{
            Log.d("HW01", "$str is Not palindrome!")
        }
        */
        /* HW Assignment problem 6
        val testNum = 88;
        val oneDigit = testNum % 10
        val tenDigit = testNum / 10
        if(oneDigit==tenDigit){
            Log.d("HW01", "Yes! two numbers are same! (Number: $testNum)")
        }else{
            Log.d("HW01", "No! two numbers are NOT same! (Number: $testNum)")
        }
         */
        /* HW Assignment problem 7
        val sequence = "abbccc"
        var sequenceArr = sequence.toCharArray() // turn the string into array of char
        var mapOfLetter = mutableMapOf<Char, Int>()

        for (char in sequenceArr) {
            if (mapOfLetter.containsKey(char)) { // if there already exists key, plus 1 to the value
                val value = mapOfLetter[char]
                if (value != null) { // I don't know why, but there was an error when I didn't check null possibility here
                    mapOfLetter[char] = value + 1
                }
            } else { // if there is no key, set the key and value
                mapOfLetter.put(char,1)
            }
        }
        for ((key, value) in mapOfLetter) {
            Log.d("HW01", "$key: $value")
        }
        */
        /* HW Assignment2 Problem 1
        val math = 103			// modify these scores for test
        val science = 91			// modify these scores for test
        val english = 82                  // modify these scores for test

        val me = Grade(math, science, english)
        Log.d("ITM","my math: $math, my science: $science, my english: $english")
        Log.d("ITM","Average is ${me.average()}")
         */
        /* HW Assignment2 Problem 2
        val p = Point(5,5)
        p.x=10
        p.y=20
        p.show()

        val cp = ColorPoint(5, 5, "YELLOW")
        cp.setPoint(10, 20)
        cp.color = "GREEN"
        cp.y=100
        cp.show()

         */
        /* HW Assignment2 Problem 3
        val item1 = ClipData.Item(name = "kangmin1").apply{
            share = 100
            price = 500
        }
         */
        /* HW Assignment2 Problem 4,5 and 6
        val capacity = 10 // modify this for test
        var myUniqueArray = mutableSetOf<ClipData.Item>() // Every elements should be unique, so I used mutableSetof<Int>
        for(i in 1..capacity)
        {
            val item = Item("Kangmin$i").apply {//use scope function apply to apply share and price
                share = 100
                price = (0..1000).random() // price is set randomly
            }
            myUniqueArray.add(item)
        }

        myUniqueArray.forEach{//print name and price using forEach
            Log.d("ITM","name: ${it.name} price: ${it.price}")
        }
            Log.d("ITM","${myUniqueArray.filter { it.price> 500 }}")


        val arr = myUniqueArray.run {
                val sortedList = sortedBy { it.price }  // sort the list by price
                val strSortedList = sortedList.joinToString(",") // return the string representation of the list
                strSortedList// return이 없어야 하는 이유:run 블록은 어떤 값을 반환하는 것이 아니라, 그 자체로 값을 갖지 않는 구문입니다. 따라서 run 블록 내에서 return을 사용하면 해당 값을 반환할 대상이 없어 오류가 발생하는 것입니다.
            }.also {
                Log.d("ITM",it.uppercase()) // print the list contents with capital letters

            }
         */
        /* HW Assignment2 Problem 7
        val address1 = "Nooooooo!!"
        val address2 = null
        val address3 = "jinw.jeong@seoultech.ac.kr"

        fun sendEmail(address: String?) {
            val emailRegex = Regex("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$") //regular expression of email
            val emailAddress = address?.takeIf { emailRegex.matches(it) } ?: run{//address is taken if it is matched with regex. and if null, fail message
                Log.d("ITM", "Failed to send email. Please enter a valid email address")
                return
            }
            Log.d("ITM", "Email sent to $emailAddress")
        }
        fun sendEmail1(address: String?) {
            val emailRegex = Regex("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$") //regular expression of email
            if (address != null && emailRegex.matches(address)) { // explicitly check if it is null or not and matches or not
                Log.d("ITM", "Email sent to $address")
            } else {
                Log.d("ITM", "Failed to send email. Please enter a valid email address")
            }
        }

        sendEmail(address1)
        sendEmail(address2)
        sendEmail(address3)
        */
        /* HW Assignment2 Problem 8
        fun draw_pyramid(floor: Int){
            val pyramid = StringBuilder().run {
                for(i in 1..floor){ // draw pyramid using a for loop
                    append(" ".repeat(floor-i)) // append white space starting from floor -1
                    append("*".repeat(2 * i - 1)) // * of pyramids grows up with step of 2, starting from 1
                    append("\n") //line break
                }
                this.toString()//make the StringBuilder instance into String
            }
            Log.d("ITM","$pyramid")
        }
        draw_pyramid(5)
         */
        /* HW Assignment2 Problem 9
        val cart = ShoppingCart()

        val product1 = Product("Jean", 50.0)
        val product2 = Product("Jean", 100.0)
        val product3 = Product("Jean", 80.0)
        val product4 = Product("Shoes", 70.0)
        val product5 = Product("Pants", 90.0)
        val product6 = Product("GPU", 2000.0)

        cart.addProduct(product1)
        cart.addProduct(product2)
        cart.addProduct(product3)
        cart.addProduct(product4)
        cart.addProduct(product5)
        cart.addProduct(product6)
        cart.calculateTotalPrice()

        cart.removeProduct("Jean")
        cart.calculateTotalPrice()

        cart.removeProduct("Shoes")
        cart.calculateTotalPrice()

        */
    }
}
/* HW Assignment2 problem 1
class Grade(math: Int, science: Int, english: Int) { // created class named Grade with primary constructor
    val avg = (math+science+english)/3 // created property avg
    fun average(): Int{ //return type of average() is Int
        return avg
    }
}
*/
/* HW Assignment2 problem 2
open class Point(open var x: Int, open var y: Int) {
    fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    open fun show(){
        Log.d("ITM","Current Point: ($x, $y)")
    }
}

class ColorPoint(x: Int, y: Int, var color: String):Point(x,y){
    fun setPoint(x: Int, y: Int){ //function to set the point
        this.x = x
        this.y = y
    }
    override var y: Int = super.y //override the property, but initialize it with value of super class property
        get() = field //custom getter and setter
        set(value) {
            field=value
            Log.d("ITM","Y has been changed to $value") // whenever y is set, this log is printed
        }

    override fun show(){
        Log.d("ITM","Color: $color Current Point: ($x, $y)") // override the show() of super class
    }
} */
/* HW Assignment2 problem 3, 4 and 5
data class Item(var name: String) { // the only parameter is name
    var price: Int = 0 // price property
        set(value) { // setter
            field = value
            Log.d("ITM","Price set to $value. Are you serious?")
        }
    var share: Int = 0 // share property
    init { // init is executed in order
        Log.d("ITM","$name item was created.")
    }
}
*/
/* HW Assignment2 Problem 9
class Product(val name: String, val price: Double) // Product class has name and price property

class ShoppingCart {
    val cart = mutableListOf<Product>() //cart is mutable list

    fun addProduct(product: Product){
        cart.add(product) // add the product into the cart
        Log.d("ITM","Add ${product.name}(${product.price}) to Shopping Cart")
    }
    fun removeProduct(productName: String){
        val removedProducts = cart.filter { it.name == productName } //filter the products using filter and lambda expression
        cart.removeAll{it.name == productName} // remove products which have same name with the parameter
        removedProducts.forEach{Log.d("ITM","Remove ${it.name} (${it.price}) from Shopping Cart")} // print out the removed products using forEach
    }
    fun calculateTotalPrice(){
        val totalPrice = cart.sumOf { it.price } //using sumOf to sum up the prices
        Log.d("ITM","Total Price: $totalPrice")

    }
}
 */


