build-image:
	@ docker build -f devops/Dockerfile -t hotelbackend:1 .
volume:
	@ docker volume create pg_tendencia_hotel_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml hotel
rm:
	@ docker stack rm hotel
	