function fn1() {
            var user = document.getElementById("text4").value;
            var password= document.getElementById("text5").value;
            if (user == 'admin') {
                if (password == 'omniwyse') {
                    document.write("Successfully Registered");
                }
                else {
                    document.write("Registration Failed");
                }
            }
            
        }