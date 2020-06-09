<template>
  <div>
    <form>
      <h2>Login</h2>
      <input v-model="credentials.username" type="text" placeholder="Username">
      <br>
      <br>
      <input v-model="credentials.password" type="password" placeholder="Password">
      <br>
      <br>
      <button type="button" v-on:click="authenticateToBackend()">Login</button>
    </form>
  </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
    return {
      credentials: {
        username: '',
        password: ''
      }
    }
  },
  methods: {
    authenticateToBackend () {
      console.log('Send this to backend')
      console.log('Username:', this.credentials.username)
      console.log('Password:', this.credentials.password)
      this.credentials.username = ''
      this.credentials.password = ''
    }
  }
}
</script>
