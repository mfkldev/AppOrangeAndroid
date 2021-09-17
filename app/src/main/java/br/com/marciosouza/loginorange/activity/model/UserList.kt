package br.com.marciosouza.loginorange.activity.model

class UserList {
    
    fun add(user: User){
        userList.add(user)
    }

    fun findAll() : List<User> {
        return userList.toList()
    }

    companion object {
        private val userList = mutableListOf<User>()
    }

    fun checkExist(username: String, password: String) : Boolean{
        return userList.any{ it.email == username && it.password == password }
    }

    fun findUser(username: String) : String? {
        return userList.find{ it.email == username}?.name
    }
}
