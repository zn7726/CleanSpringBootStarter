package com.springboottest.starter.topic.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboottest.starter.topic.beans.Topic;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework Desc"),
			new Topic("Java", "Core Java", "Core Java Desc"),
			new Topic("javascript", "JavaScript", "JavaScript Desc")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i = 0; i < topics.size(); i ++){
			if(topics.get(i).getId().equalsIgnoreCase(id)) {
				topics.set(i, topic);
				return;				
			}
		}		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}
	
	
}
  