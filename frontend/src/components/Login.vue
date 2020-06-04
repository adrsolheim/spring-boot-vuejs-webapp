<template>
  <div>
    <h1>Login</h1>
    <input v-model="username" placeholder="Username">
    <input v-model="password" type="password" placeholder="Password">
    <p>U: {{ username }}</p>
    <p>P: {{ password }}</p>
  </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
    return {
      username: '',
      password: ''
    }
  }
}
</script>
