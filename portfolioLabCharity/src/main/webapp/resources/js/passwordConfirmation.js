function checkPassword(str) {
    var re = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/;
    return re.test(str);
}
function checkForm(form) {
    if (form.password.value != "" && form.password.value == form.password2.value) {
        if (!checkPassword(form.password.value)) {
            alert("The password you have entered is not valid!");
            form.password.focus();
            return false;
        }
    } else {
        alert("Error: Please check that you've entered and confirmed your password!");
        form.password.focus();
        return false;
    }
    return true;
}