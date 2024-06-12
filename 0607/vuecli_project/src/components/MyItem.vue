<template>
    <div class="box">
        <h1 class="title">我是一个子组件的标题{{ msg }}</h1>
        <img src="@/assets/logo.png" alt="">
    </div>
</template>

<script>
export default {
    data() {
        return {
            msg: '我是msg'
        }
    }
}
</script>

<style lang="less" scoped>
.box {
    .title {
        background: red;
    }
}
</style>