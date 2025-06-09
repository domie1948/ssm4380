import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import jianshenkecheng from '@/views/modules/jianshenkecheng/list'
    import qicaileixing from '@/views/modules/qicaileixing/list'
    import jianshenleixing from '@/views/modules/jianshenleixing/list'
    import jianshenqicai from '@/views/modules/jianshenqicai/list'
    import jianshenjiaolian from '@/views/modules/jianshenjiaolian/list'
    import forum from '@/views/modules/forum/list'
    import jianshenzhishi from '@/views/modules/jianshenzhishi/list'
    import shangpindingdan from '@/views/modules/shangpindingdan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import kechenggoumai from '@/views/modules/kechenggoumai/list'
    import config from '@/views/modules/config/list'
    import jianshenshangpin from '@/views/modules/jianshenshangpin/list'
    import jiaolianyuyue from '@/views/modules/jiaolianyuyue/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/jianshenkecheng',
        name: '健身课程',
        component: jianshenkecheng
      }
          ,{
	path: '/qicaileixing',
        name: '器材类型',
        component: qicaileixing
      }
          ,{
	path: '/jianshenleixing',
        name: '健身类型',
        component: jianshenleixing
      }
          ,{
	path: '/jianshenqicai',
        name: '健身器材',
        component: jianshenqicai
      }
          ,{
	path: '/jianshenjiaolian',
        name: '健身教练',
        component: jianshenjiaolian
      }
          ,{
	path: '/forum',
        name: '健身论坛',
        component: forum
      }
          ,{
	path: '/jianshenzhishi',
        name: '健身知识',
        component: jianshenzhishi
      }
          ,{
	path: '/shangpindingdan',
        name: '商品订单',
        component: shangpindingdan
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/kechenggoumai',
        name: '课程购买',
        component: kechenggoumai
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/jianshenshangpin',
        name: '健身商品',
        component: jianshenshangpin
      }
          ,{
	path: '/jiaolianyuyue',
        name: '教练预约',
        component: jiaolianyuyue
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
