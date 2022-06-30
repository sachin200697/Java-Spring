Bean for collection types:
<!--Create a bean for list collection-->
    <bean>
        <property name="list">
            <list>
                <value>10</value>
                <value>20</value>
                <value>30</value>
                <value>40</value>
                <null/>
            </list>
        </property>
    </bean>
    
    <!--creting a bean for set collection-->
    <bean>
        <property name="set">
            <set>
                <value>10</value>
                <value>20</value>
                <value>30</value>
                <value>40</value>
                <null/>
            </set>
        </property>
    </bean>
    
    <!--creating a bean for map--> 
    <bean>
        <property name="map">
            <map>
                <entry key="name" value="Sahcin" />
                <entry key="age" value="12" />                
            </map>
        </property>
    </bean>
    
    <!--creating a bean for property collection-->
    <bean>
        <property name="properties">
            <props>
                <prop key="name">Naman</prop>
                <prop key="age">12</prop> 
                
            </props>
        </property>
    </bean>

Refrence Type:
A is dependent on B:
<bean name="referenceA" class="com.sachin.ref.A">
    <property name="">
        <ref bean="B"/>
    </property>
</bean>
