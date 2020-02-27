function fn1() {
    var user = document.getElementById("text1").value;
    var password= document.getElementById("text2").value;
    if (user == 'siri') {
        if (password == 'rithusri') {
            document.write("Login Success");
        }
        else {
            document.write("Login Failed");
        }
    }
    
}