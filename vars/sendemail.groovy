def call(Map config = [:]) {
    loadLinuxScript (name: 'sendemail.sh')
    sh "./sendemail.sh    ${config.name} ${config.surname}."
}