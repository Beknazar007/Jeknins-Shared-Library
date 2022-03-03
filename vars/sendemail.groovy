def call(Map config = [:]) {
    loadLinuxScript (name: 'sendemail.sh')
    // sh "./sendemail.sh    ${config.name} ${config.surname}."
    mail bcc: '', body: 'Please make sure that you started your build', cc: '', from: '', replyTo: '', subject: 'Your build started', to: 'esenbaevnurmuhamed7@gmail.com' 
}