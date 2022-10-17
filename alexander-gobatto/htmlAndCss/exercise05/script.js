function submit() {
    const fullname = document.getElementsByName("fullname");
    const email = document.getElementsByName("email");
    const password = document.getElementsByName("password");

    const fields = [fullname, email, password];
    
    fields.map(item => {
        if(!item[0].value.trim()){
            document.getElementById(`error-${item[0].name}`).innerHTML = "Este campo é obrigatório.";
        } else {
            document.getElementById(`error-${item[0].name}`).innerHTML = null;
        }
    })

}