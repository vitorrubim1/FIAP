function validateRequiredInputs(inputs) {
    inputs.forEach(inputName => {
        const input = document.getElementById(inputName);
        const inputIsEmpty = !input.value.trim();

        if(inputIsEmpty) {
            const newSpanError = document.createElement("span");
            const newSpanErrorContent = document.createTextNode(`O campo ${input.name} é obrigatório.`);
            newSpanError.appendChild(newSpanErrorContent);
            
            newSpanError.classList.add("error");
            input.classList.add("inputWithError");
            newSpanError.setAttribute("id", `error-${inputName}`);

            const spanErrorAlreadyExist = document.getElementById(`error-${inputName}`);

            if (spanErrorAlreadyExist) return;

            document.body.insertBefore(newSpanError, input.nextSibling)
        } else {
            const spanError = document.getElementById(`error-${inputName}`);
            const inputWithError = input.classList.remove("inputWithError");

            if (!!spanError) spanError.remove();
            if (!!inputWithError) input.classList.remove("inputWithError")
        }
    })
}