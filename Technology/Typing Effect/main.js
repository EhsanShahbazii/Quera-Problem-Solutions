const buttonWrite = document.getElementById("test-typing");

buttonWrite.addEventListener('click', () => {

    const userText = document.getElementById("user-caption").value;
    const inputs = document.getElementById("caption");

    //this method print chars with 30ms delay
    const printCharByChar = (input) => {
        let count = 0;
        let printInterval = setInterval(() => {
            if (input.length > count)
                inputs.innerText += input[count++];
            else
                clearInterval(printInterval);
        }, 30);
    }

    //check user text is empty or not
    if (userText === "") {
        printCharByChar("typing test!");
    }

    //print characters one by one with 30ms delay
    inputs.innerText = "";
    printCharByChar(userText);
});

const buttonDelete = document.getElementById("test-erasing");

buttonDelete.addEventListener('click', () => {

    const captions = document.getElementById("caption");

    //this method delete chars with 30ms delay
    const deleteCharByChar = (input) => {
        let counts = input.length;
        let printIntervals = setInterval(() => {
            if (counts > 0)
                captions.innerText = input.substring(0, counts);
            else
                clearInterval(printIntervals);
            counts--;
        }, 30);
    }

    if (captions.innerText === "") {
        deleteCharByChar("erasing test!");
    }else {
        //this method delete chars with 30ms delay
        const deleteCharByChar = (input) => {
            let counts = input.length;
            let printIntervals = setInterval(() => {
                if (counts > 0)
                    captions.innerText = input.substring(0, counts-1);
                else
                    clearInterval(printIntervals);
                counts--;
            }, 30);
        }

        deleteCharByChar(captions.innerText);
    }

});