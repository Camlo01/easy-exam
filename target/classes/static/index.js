
async function sendDataFreeText() {

    const question = {
        type: document.getElementById("inputQuestionType").value,
        questionText: document.getElementById("inputQuestionText").value,
        questionType: document.getElementById("inputQuestionType").value
    }

    const data = [
        question,
        question
    ]

    fetch("http://127.0.0.1:8085/api/easy-exam/questionnaire/document-xls", {
        method: "POST",
        body: JSON.stringify(data),
        mode: "cors", // no-cors, *cors, same-origin
        cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
        credentials: "same-origin", // include, *same-origin, omit
        headers: {
            "Content-Type": "application/json",
        },
    })
        .then(response => response.blob())
        .then(blob => {
            const url = window.URL.createObjectURL(new Blob([blob]));
            const a = document.createElement('a');
            a.href = url;
            a.download = 'archivo.xls';
            document.body.appendChild(a); // necesitas agregar el enlace al DOM para que el click funcione
            a.click();
            a.remove(); // elimina el enlace del DOM cuando ya no lo necesitas
        });

}

async function sendDataKeyword() {

    const question = {
        type: document.getElementById("inputQuestionType").value,
        questionText: document.getElementById("inputQuestionText").value,
        questionType: document.getElementById("inputQuestionType").value,
        answer1: "Palabra random"
  
    }

    const data = [
        question,
        question
    ]

    fetch("http://127.0.0.1:8085/api/easy-exam/questionnaire/document-xls", {
        method: "POST",
        body: JSON.stringify(data),
        mode: "cors", // no-cors, *cors, same-origin
        cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
        credentials: "same-origin", // include, *same-origin, omit
        headers: {
            "Content-Type": "application/json",
        },
    })
        .then(response => response.blob())
        .then(blob => {
            const url = window.URL.createObjectURL(new Blob([blob]));
            const a = document.createElement('a');
            a.href = url;
            a.download = 'archivo.xls';
            document.body.appendChild(a); // necesitas agregar el enlace al DOM para que el click funcione
            a.click();
            a.remove(); // elimina el enlace del DOM cuando ya no lo necesitas
        });

}


async function sendDataMatch() {

    const question = {
        type: document.getElementById("inputQuestionType").value,
        questionText: document.getElementById("inputQuestionText").value,
        questionType: document.getElementById("inputQuestionType").value
    }

    const data = [
        question,
        question
    ]

    fetch("http://127.0.0.1:8085/api/easy-exam/questionnaire/document-xls", {
        method: "POST",
        body: JSON.stringify(data),
        mode: "cors", // no-cors, *cors, same-origin
        cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
        credentials: "same-origin", // include, *same-origin, omit
        headers: {
            "Content-Type": "application/json",
        },
    })
        .then(response => response.blob())
        .then(blob => {
            const url = window.URL.createObjectURL(new Blob([blob]));
            const a = document.createElement('a');
            a.href = url;
            a.download = 'archivo.xls';
            document.body.appendChild(a); // necesitas agregar el enlace al DOM para que el click funcione
            a.click();
            a.remove(); // elimina el enlace del DOM cuando ya no lo necesitas
        });

}

async function sendDataMultichoice() {

    const question = {
        type: document.getElementById("inputQuestionType").value,
        questionText: document.getElementById("inputQuestionText").value,
        questionType: document.getElementById("inputQuestionType").value
    }

    const data = [
        question,
        question
    ]

    fetch("http://127.0.0.1:8085/api/easy-exam/questionnaire/document-xls", {
        method: "POST",
        body: JSON.stringify(data),
        mode: "cors", // no-cors, *cors, same-origin
        cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
        credentials: "same-origin", // include, *same-origin, omit
        headers: {
            "Content-Type": "application/json",
        },
    })
        .then(response => response.blob())
        .then(blob => {
            const url = window.URL.createObjectURL(new Blob([blob]));
            const a = document.createElement('a');
            a.href = url;
            a.download = 'archivo.xls';
            document.body.appendChild(a); // necesitas agregar el enlace al DOM para que el click funcione
            a.click();
            a.remove(); // elimina el enlace del DOM cuando ya no lo necesitas
        });

}

async function sendDataSecuence() {

    const question = {
        type: document.getElementById("inputQuestionType").value,
        questionText: document.getElementById("inputQuestionText").value,
        questionType: document.getElementById("inputQuestionType").value
    }

    const data = [
        question,
        question
    ]

    fetch("http://127.0.0.1:8085/api/easy-exam/questionnaire/document-xls", {
        method: "POST",
        body: JSON.stringify(data),
        mode: "cors", // no-cors, *cors, same-origin
        cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
        credentials: "same-origin", // include, *same-origin, omit
        headers: {
            "Content-Type": "application/json",
        },
    })
        .then(response => response.blob())
        .then(blob => {
            const url = window.URL.createObjectURL(new Blob([blob]));
            const a = document.createElement('a');
            a.href = url;
            a.download = 'archivo.xls';
            document.body.appendChild(a); // necesitas agregar el enlace al DOM para que el click funcione
            a.click();
            a.remove(); // elimina el enlace del DOM cuando ya no lo necesitas
        });

}
// function getValues() {

//     const question = {
//         questionText: document.getElementById("inputQuestionText").getValues(),
//         questionType: document.getElementById("inputQuestionType").getValues(),
//         showAnswerHint: false,
//         correctToProceed: false,
//         showFeedback: "<p>Sorry Try Again..</p>",
//         weight: "qwerty",
//         isOptional: false,
//         NoMarkingRequired: false,
//         markingGuide: document.getElementById("inputMarkingGuide").getValues()
//     }
//     return question;

// }