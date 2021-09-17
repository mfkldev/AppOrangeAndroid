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
}
