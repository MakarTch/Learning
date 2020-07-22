"use strict"

function myFunction(){
	document.getElementById("demo3").innerHTML = "text different";
}
function myFunction2(value){
	text +=value;
}
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
	text1 += person[x];
}
document.getElementById("demo12").innerHTML= text1;
console.log(" text1 is " +text1);




