function submit() {
    const fullname = document.getElementsByName("fullname");
    const email = document.getElementsByName("email");
    const password = document.getElementsByName("password");

    const fields = [fullname, email, password];
    
    // Span error element
    fields.forEach(item => {
        const inputIsEmpty = !item[0].value.trim();
        const inputName = item[0].name;
        
        if(inputIsEmpty) {
            const newSpanError = document.createElement("span");
            const newSpanErrorContent = document.createTextNode("Este campo é obrigatório.");
            newSpanError.appendChild(newSpanErrorContent);
            
            const currentInput = item[0];
            newSpanError.classList.add("error")
            newSpanError.setAttribute("id", `error-${inputName}`)

            const spanErrorAlreadyExist = document.getElementById(`error-${inputName}`);

            if (spanErrorAlreadyExist) return;

            document.body.insertBefore(newSpanError, currentInput.nextSibling)
        } else {
            const spanError = document.getElementById(`error-${inputName}`);

            if (!!spanError) spanError.remove();
        }
    })
}