import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '@/components/Home'
import MovieView from '@/components/Movie'
import AboutView from '@/components/About'
// 把VueRouter安装为vue项目的插件
Vue.use(VueRouter)
// 创建路由的实例对象
// const router =  new VueRouter()
// 配置路由的对应关系  (路由规则)
const router = new VueRouter({
  routes: [
    {
      path: '/home',
      component: HomeView
    },
    {
      path: '/movie',
      component: MovieView
    },
    {
      path: '/about',
      component: AboutView
    }
  ]
})

// 向外暴露router路由对象
export default router
