<template>
    <div>
        <h1>我是home 组件</h1>
        <button @click="fun1">点我</button>
    </div>
</template>

<script>
export default {
  methods: {
    fun1 () {
      this.$router.push('/movie') // 会增加一条历史记录
    }
  }
}
</script>

<style></style>
