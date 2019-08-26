package 结构型模式_7种.装饰者模式;

/**
 * 定义装饰者
 * @author sk
 *
 * 动态给一个对象添加一些额外的职责,就象在墙上刷油漆.使用Decorator模式相比用生成子类方式达到功能的扩充显得更为灵活。
 * 设计初衷:通常可以使用继承来实现功能的拓展,如果这些需要拓展的功能的种类很繁多,那么势必生成很多子类,增加系统的复杂性,
 * 同时,使用继承实现功能拓展,我们必须可预见这些拓展功能,这些功能是编译时就确定了,是静态的。
 *
 * 装饰者与被装饰者拥有共同的超类，继承的目的是继承类型，而不是行为
 * 适配器模式的意义是要将一个接口转变成另一个接口，它的目的是通过改变接口来达到重复使用的目的，
 * 而装饰器模式则是保持原有的接口，从而增强原有对象的功能，或者改变原有对象的处理方式而提升性能。
    */
public abstract class Decorator extends Humburger {

  @Override
  public abstract String getName();
}
