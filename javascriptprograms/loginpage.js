<html>


<head>
    
    
    <title>JAVASCRIPT </title>
    <script></script>
function fn1() {
            var user = document.getElementById("text1").value;
            var password= document.getElementById("text2").value;
            if (user == 'siri') {
                if (password == 'rithusri') {
                    console.log("Login Success");
                }
                else {
                    console.log("Login Failed");
                }
            }
            
        }
        <input id="text1" placeholder="Username">
    <br>
    <br>
    <input type="password" id="text2" placeholder="Password">
    <br>
    <br>
    <button onclick="fn1()" id="btn1">Login</button>
    </body>


</html>