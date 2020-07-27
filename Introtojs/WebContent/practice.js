function myFunction(){
	document.getElementById("demo3").innerHTML = "text different";
}
function myFunction2(value){
	text +=value;
}
function myFunction3(){
	document.getElementById("demo13").innerHTML = "Im here now";
}
function myFunction4(){
	return arguments.length + " is the number of parameters passed throught the function";
}
function capitalize(string){
	var lowerCase = string.toLowerCase();
	return string.charAt(0).toUpperCase() + lower.slice(1);
}
function myFunction5(){
	var x = document.forms["form1"];
	var text = "";
	var i;
	for (i=0;i<x.length;i++){
		text += x.elements[i].value+"<br>";
	}
	
	document.getElementById("demo20").innerHTML = text;
}
function myFunction6() {
	  window.alert("Page is loaded");
	}//This isnt working >:(
var f = {
		g:1, 
		h:2, 
		i:3,
		added: function() {
			return this.g + this.h;
		}
	};
	document.getElementById("demo4").innerHTML = f.added() ;
	
var cat = "Maurice", dog = "Urn", parrot = "Joey";
document.getElementById("demo5").innerHTML = cat + dog + parrot + typeof cat;

var people = ["john", "kat", "greenman"];
document.getElementById("demo7").innerHTML = people;

var text = "";
people.forEach(myFunction2);
document.getElementById("demo8").innerHTML= text;

document.getElementById("demo9").innerHTML = people.join(", ");

document.getElementById("demo10").innerHTML = Math.random();

console.log(text);

var greeting;
var time = new Date().getHours();
if (time <12){
	greeting = "good morning";
}else if (time<18){
	greeting = "good afternoon";
}else{
	greeting = "good night";
}
document.getElementById("demo11").innerHTML= greeting;

var person = {firstName:"Mak", lastName:"Tee", age:23};
var x;
var text1="";
for (x in person){
	text1 += person[x] + " ";
}
document.getElementById("demo12").innerHTML= text1;

var automobile ={
	color:"red",
	seats:5,
	brand:"chevy",
	display:function(){
		return "This car is " + this.color + " " + this.brand+  " that has " + this.seats + " seats";
	}
};

document.getElementById("demo13").innerHTML = automobile.display();

class Teacher{
	constructor(name, subject, period){
		this.name = name;
		this.subject = subject;
		this.period = period;
	}
	get toString(){
		return this.name + this.subject + this.period + " this is me learning how to use classes in js";
	}
	set changePeriod(x){
		this.period = x;	
	}
	static hello(){
		return "Hello from the Teacher class";
	}
}
var Barkin = new Teacher("Barkin", "Math", 3);
Barkin.changePeriod=5;
document.getElementById("demo14").innerHTML = Barkin.toString;
document.getElementById("demo15").innerHTML = Teacher.hello();
document.getElementById("demo16").innerHTML = myFunction4(1,2,3,4,5) ;
document.getElementById("demo17").innerHTML = document.URL ;

var textHolder = document.getElementById("demo18");
document.getElementById("demo19").innerHTML=textHolder.innerHTML + " should be the same as the line before";








